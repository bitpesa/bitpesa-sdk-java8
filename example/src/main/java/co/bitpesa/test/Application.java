package co.bitpesa.test;

import co.bitpesa.sdk.ApiClient;
import co.bitpesa.sdk.ApiException;
import co.bitpesa.sdk.api.AccountDebitsApi;
import co.bitpesa.sdk.api.AccountValidationApi;
import co.bitpesa.sdk.api.TransactionsApi;
import co.bitpesa.sdk.model.*;

import java.math.BigDecimal;
import java.util.UUID;

public class Application {
    public static String accountValidationExample(ApiClient apiClient) throws ApiException {
        AccountValidationRequest request = new AccountValidationRequest();
        request.setBankAccount("9040009999999");
        request.setBankCode("190100");
        request.setCountry(AccountValidationRequest.CountryEnum.GH);
        request.setCurrency(AccountValidationRequest.CurrencyEnum.GHS);
        request.setMethod(AccountValidationRequest.MethodEnum.BANK);

        try {
            AccountValidationApi avi = new AccountValidationApi(apiClient);
            AccountValidationResponse accountValidation = avi.postAccountValidations(request);
            System.out.println("Account Name" + accountValidation.getObject().getAccountName());
            return accountValidation.getObject().getAccountName();
        } catch (ApiException e) {
            if (e.isValidationError()) {
                AccountValidationResponse accountValidation = e.getResponseObject(AccountValidationResponse.class);
                System.out.println("Account Holder Name Error" + accountValidation.getMeta().getError());
            } else {
                throw e;
            }
            return null;
        }
    }

    public static UUID createTransactionExample(ApiClient apiClient) throws ApiException {
        TransactionsApi api = new TransactionsApi(apiClient);
        Transaction transaction = new Transaction();

        Sender sender = new Sender();
        sender.setId(UUID.fromString("058de445-ffff-ffff-ffff-da9c751d14bf"));

        PayoutMethodDetails ngnBankDetails = new PayoutMethodDetails();
        ngnBankDetails.setBankAccount("123456789");
        ngnBankDetails.setBankAccountType(PayoutMethodBankAccountTypeEnum._20);
        ngnBankDetails.setBankCode("082");
        ngnBankDetails.setFirstName("First");
        ngnBankDetails.setLastName("Last");

        PayoutMethod payoutMethod = new PayoutMethod();
        payoutMethod.setType("NGN::Bank");
        payoutMethod.setDetails(ngnBankDetails);

        Recipient recipient = new Recipient();
        recipient.setRequestedAmount(new BigDecimal("10000"));
        recipient.setRequestedCurrency("NGN");
        recipient.setPayoutMethod(payoutMethod);

        transaction.setInputCurrency("USD");
        transaction.setSender(sender);
        transaction.addRecipientsItem(recipient);

        try {
            TransactionRequest transactionRequest = new TransactionRequest();
            transactionRequest.setTransaction(transaction);
            TransactionResponse transactionResponse = api.postTransactions(transactionRequest);
            System.out.println("Transaction created! ID" + transactionResponse.getObject().getId());
            System.out.println(transactionResponse.getObject());
            return transactionResponse.getObject().getId();
        } catch (ApiException e) {
            if (e.isValidationError()) {
                TransactionResponse transactionResponse = e.getResponseObject(TransactionResponse.class);
                System.out.println("Validation Error" + transactionResponse.getObject().getErrors());
            } else {
                throw e;
            }
            return null;
        }
    }

    public static UUID createAndFundTransactionExample(ApiClient apiClient) throws Exception {
        UUID transactionId = createTransactionExample(apiClient);
        if (transactionId != null) {
            Debit debit = new Debit();
            debit.setCurrency("USD");
            debit.setToId(transactionId);
            debit.setToType("Transaction");

            DebitRequestWrapper debitRequest = new DebitRequestWrapper();
            debitRequest.addDebitItem(debit);

            AccountDebitsApi debitsApi = new AccountDebitsApi(apiClient);
            try {
                DebitListResponse debitListResponse = debitsApi.postAccountsDebits(debitRequest);
                System.out.println("Transaction Funded Successfully");
                System.out.println(debitListResponse.getObject().get(0));
            } catch (ApiException e) {
                if (e.isValidationError()) {
                    DebitListResponse debitListResponse = e.getResponseObject(DebitListResponse.class);
                    System.out.println("Transaction could not be funded");
                    System.out.println(debitListResponse.getObject().get(0).getErrors());
                } else {
                    throw e;
                }
            }
        }
        return transactionId;
    }

    public static void getTransactionErrorMessageExample(ApiClient apiClient) throws ApiException {
        UUID transactionId = UUID.fromString("990b9203-ffff-ffff-ffff-897f20eaefa8");

        TransactionsApi transactionsApi = new TransactionsApi(apiClient);
        TransactionResponse transaction = transactionsApi.getTransaction(transactionId);
        System.out.println("Get recipient's state error message: "+ transaction.getObject().getRecipients().get(0).getStateReason());
    }

    public static void webhookParseExample(ApiClient apiClient) throws ApiException {
        String webhookContent = "{\n" +
                "  \"webhook\": \"02b769ff-ffff-ffff-ffff-820d285d76c7\",\n" +
                "  \"event\": \"transaction.created\",\n" +
                "  \"object\": {\n" +
                "    \"id\": \"9170b966-ffff-ffff-ffff-7af5ad7e335f\",\n" +
                "    \"metadata\": {},\n" +
                "    \"state\": \"approved\",\n" +
                "    \"input_amount\": 50.00,\n" +
                "    \"input_currency\": \"EUR\",\n" +
                "    \"sender\": {\n" +
                "      \"id\": \"4be2a144-ffff-ffff-ffff-8ebcbfbbbe0c\",\n" +
                "      \"type\": \"person\",\n" +
                "      \"state\": \"initial\",\n" +
                "      \"state_reason\": null,\n" +
                "      \"country\": \"GB\",\n" +
                "      \"street\": \"Test\",\n" +
                "      \"postal_code\": \"EH1 1TT\",\n" +
                "      \"city\": \"London\",\n" +
                "      \"phone_country\": \"GB\",\n" +
                "      \"phone_number\": \"+447123456789\",\n" +
                "      \"email\": \"test@example.com\",\n" +
                "      \"ip\": \"127.0.0.1\",\n" +
                "      \"first_name\": \"Test\",\n" +
                "      \"last_name\": \"Name\",\n" +
                "      \"birth_date\": \"1990-01-01\",\n" +
                "      \"metadata\": {},\n" +
                "      \"providers\": {}\n" +
                "    },\n" +
                "    \"payin_methods\": [],\n" +
                "    \"paid_amount\": 50.00,\n" +
                "    \"due_amount\": 0,\n" +
                "    \"recipients\": [\n" +
                "      {\n" +
                "        \"id\": \"69dee5aa-ffff-ffff-ffff-0a2c06353c6b\",\n" +
                "        \"transaction_id\": \"9170b966-ffff-ffff-ffff-7af5ad7e335f\",\n" +
                "        \"created_at\": \"2017-07-24T15:08:58Z\",\n" +
                "        \"input_usd_amount\": 60.00,\n" +
                "        \"state\": \"initial\",\n" +
                "        \"transaction_state\": \"initial\",\n" +
                "        \"requested_amount\": 50.00,\n" +
                "        \"requested_currency\": \"EUR\",\n" +
                "        \"input_amount\": 50.00,\n" +
                "        \"input_currency\": \"EUR\",\n" +
                "        \"output_amount\": 20001,\n" +
                "        \"output_currency\": \"NGN\",\n" +
                "        \"payout_method\": {\n" +
                "          \"id\": \"c67580ee-ffff-ffff-ffff-ac51f1d0c035\",\n" +
                "          \"type\": \"NGN::Bank\",\n" +
                "          \"details\": {\n" +
                "            \"email\": \"\",\n" +
                "            \"bank_code\": \"011\",\n" +
                "            \"last_name\": \"Test\",\n" +
                "            \"first_name\": \"User\",\n" +
                "            \"bank_account\": \"1111111111\",\n" +
                "            \"bank_account_type\": \"10\"\n" +
                "          },\n" +
                "          \"metadata\": {},\n" +
                "          \"provider\": \"interswitch\",\n" +
                "          \"fields\": {\n" +
                "            \"email\": {\n" +
                "              \"type\": \"input\",\n" +
                "              \"validations\": {\n" +
                "                \"format\": \"\\\\A((\\\\w+([\\\\-+.]\\\\w+)*@[a-zA-Z0-9]+([\\\\-\\\\.][a-zA-Z0-9]+)*)*){3,320}\\\\z\"\n" +
                "              }\n" +
                "            },\n" +
                "            \"first_name\": {\n" +
                "              \"type\": \"input\",\n" +
                "              \"validations\": {\n" +
                "                \"presence\": true\n" +
                "              }\n" +
                "            },\n" +
                "            \"last_name\": {\n" +
                "              \"type\": \"input\",\n" +
                "              \"validations\": {\n" +
                "                \"presence\": true\n" +
                "              }\n" +
                "            },\n" +
                "            \"bank_code\": {\n" +
                "              \"type\": \"select\",\n" +
                "              \"options\": {\n" +
                "                \"063\": \"Diamond Bank\",\n" +
                "                \"050\": \"EcoBank\",\n" +
                "                \"214\": \"FCMB Bank\",\n" +
                "                \"070\": \"Fidelity Bank\",\n" +
                "                \"011\": \"First Bank of Nigeria\",\n" +
                "                \"058\": \"Guaranty Trust Bank \",\n" +
                "                \"030\": \"Heritage Bank\",\n" +
                "                \"301\": \"Jaiz Bank\",\n" +
                "                \"082\": \"Keystone \",\n" +
                "                \"014\": \"Mainstreet \",\n" +
                "                \"076\": \"Skye Bank\",\n" +
                "                \"039\": \"Stanbic IBTC Bank \",\n" +
                "                \"232\": \"Sterling bank\",\n" +
                "                \"032\": \"Union Bank\",\n" +
                "                \"033\": \"United Bank for Africa \",\n" +
                "                \"215\": \"Unity Bank\",\n" +
                "                \"035\": \"Wema Bank\",\n" +
                "                \"057\": \"Zenith International \"\n" +
                "              },\n" +
                "              \"validations\": {\n" +
                "                \"presence\": true,\n" +
                "                \"inclusion\": {\n" +
                "                  \"in\": {\n" +
                "                    \"063\": \"Diamond Bank\",\n" +
                "                    \"050\": \"EcoBank\",\n" +
                "                    \"214\": \"FCMB Bank\",\n" +
                "                    \"070\": \"Fidelity Bank\",\n" +
                "                    \"011\": \"First Bank of Nigeria\",\n" +
                "                    \"058\": \"Guaranty Trust Bank \",\n" +
                "                    \"030\": \"Heritage Bank\",\n" +
                "                    \"301\": \"Jaiz Bank\",\n" +
                "                    \"082\": \"Keystone \",\n" +
                "                    \"014\": \"Mainstreet \",\n" +
                "                    \"076\": \"Skye Bank\",\n" +
                "                    \"039\": \"Stanbic IBTC Bank \",\n" +
                "                    \"232\": \"Sterling bank\",\n" +
                "                    \"032\": \"Union Bank\",\n" +
                "                    \"033\": \"United Bank for Africa \",\n" +
                "                    \"215\": \"Unity Bank\",\n" +
                "                    \"035\": \"Wema Bank\",\n" +
                "                    \"057\": \"Zenith International \"\n" +
                "                  }\n" +
                "                }\n" +
                "              }\n" +
                "            },\n" +
                "            \"bank_account\": {\n" +
                "              \"type\": \"input\",\n" +
                "              \"validations\": {\n" +
                "                \"presence\": true\n" +
                "              }\n" +
                "            },\n" +
                "            \"bank_account_type\": {\n" +
                "              \"type\": \"select\",\n" +
                "              \"options\": {\n" +
                "                \"20\": \"Current\",\n" +
                "                \"10\": \"Savings\"\n" +
                "              },\n" +
                "              \"validations\": {\n" +
                "                \"presence\": true,\n" +
                "                \"inclusion\": {\n" +
                "                  \"in\": {\n" +
                "                    \"20\": \"Current\",\n" +
                "                    \"10\": \"Savings\"\n" +
                "                  }\n" +
                "                }\n" +
                "              }\n" +
                "            }\n" +
                "          }\n" +
                "        },\n" +
                "        \"metadata\": {}\n" +
                "      }\n" +
                "    ],\n" +
                "    \"created_at\": \"2017-07-24T15:08:58Z\",\n" +
                "    \"expires_at\": \"2017-07-24T16:08:58Z\"\n" +
                "  }\n" +
                "}";

        Webhook webhook = apiClient.parseResponseString(webhookContent, Webhook.class);
        if (webhook.getEvent().startsWith("transaction")) {
            TransactionWebhook transactionWebhook = apiClient.parseResponseString(webhookContent, TransactionWebhook.class);
            System.out.println(transactionWebhook);
        } else if (webhook.getEvent().startsWith("recipient")) {
            RecipientWebhook recipientWebhook = apiClient.parseResponseString(webhookContent, RecipientWebhook.class);
            System.out.println(recipientWebhook);
        } else if (webhook.getEvent().startsWith("payout_method")) {
            PayoutMethodWebhook payoutMethodWebhook = apiClient.parseResponseString(webhookContent, PayoutMethodWebhook.class);
            System.out.println(payoutMethodWebhook);
        } else if (webhook.getEvent().startsWith("sender")) {
            SenderWebhook senderWebhook = apiClient.parseResponseString(webhookContent, SenderWebhook.class);
            System.out.println(senderWebhook);
        } else if (webhook.getEvent().startsWith("document")) {
            DocumentWebhook documentWebhook = apiClient.parseResponseString(webhookContent, DocumentWebhook.class);
            System.out.println(documentWebhook);
        }
    }

    public static void main(String[] args) throws Exception {
        ApiClient apiClient = new ApiClient();
        apiClient.setApiKey("<key>");
        apiClient.setApiSecret("<secret>");
        apiClient.setBasePath("https://api-sandbox.bitpesa.co/v1");

        //accountValidationExample(apiClient);
        //createAndFundTransactionExample(apiClient);
        //getTransactionErrorMessageExample(apiClient);
        //webhookParseExample(apiClient);
    }
}
