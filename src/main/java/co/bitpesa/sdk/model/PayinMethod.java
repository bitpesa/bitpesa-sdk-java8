/*
 * BitPesa API
 * Reference documentation for the BitPesa API V1
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package co.bitpesa.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import co.bitpesa.sdk.model.PayinMethodDetails;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * This describes the specific details on how the funds should be collected from the sender.
 */
@ApiModel(description = "This describes the specific details on how the funds should be collected from the sender.")

public class PayinMethod {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_IN_DETAILS = "in_details";
  @SerializedName(SERIALIZED_NAME_IN_DETAILS)
  private PayinMethodDetails inDetails = null;

  public static final String SERIALIZED_NAME_OUT_DETAILS = "out_details";
  @SerializedName(SERIALIZED_NAME_OUT_DETAILS)
  private Object outDetails = null;

  public static final String SERIALIZED_NAME_INSTRUCTIONS = "instructions";
  @SerializedName(SERIALIZED_NAME_INSTRUCTIONS)
  private Object instructions = null;

  public static final String SERIALIZED_NAME_PROVIDER = "provider";
  @SerializedName(SERIALIZED_NAME_PROVIDER)
  private String provider;

  public PayinMethod type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Describes how the payment should be requested from the user.  Possible values: - &#x60;NGN::Bank&#x60;: NGN card collection requests - &#x60;GHS::Mobile&#x60;: GHS mobile collections - &#x60;TZS::Mobile&#x60;: TZS mobile collections - &#x60;UGX::Mobile&#x60;: UGX mobile collections 
   * @return type
  **/
  @ApiModelProperty(example = "NGN::Bank", value = "Describes how the payment should be requested from the user.  Possible values: - `NGN::Bank`: NGN card collection requests - `GHS::Mobile`: GHS mobile collections - `TZS::Mobile`: TZS mobile collections - `UGX::Mobile`: UGX mobile collections ")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public PayinMethod inDetails(PayinMethodDetails inDetails) {
    this.inDetails = inDetails;
    return this;
  }

   /**
   * Get inDetails
   * @return inDetails
  **/
  @ApiModelProperty(value = "")
  public PayinMethodDetails getInDetails() {
    return inDetails;
  }

  public void setInDetails(PayinMethodDetails inDetails) {
    this.inDetails = inDetails;
  }

   /**
   * This will contain the description on where to pay the funds. Please see the [Collections from Senders](https://github.com/bitpesa/api-documentation/blob/master/additional-features.md#collections-from-senders) in the API documentation on what to expect here.
   * @return outDetails
  **/
  @ApiModelProperty(value = "This will contain the description on where to pay the funds. Please see the [Collections from Senders](https://github.com/bitpesa/api-documentation/blob/master/additional-features.md#collections-from-senders) in the API documentation on what to expect here.")
  public Object getOutDetails() {
    return outDetails;
  }

   /**
   * This will contain the instructions on how to pay the funds. Please see the [Collections from Senders](https://github.com/bitpesa/api-documentation/blob/master/additional-features.md#collections-from-senders) in the API documentation on what to expect here.
   * @return instructions
  **/
  @ApiModelProperty(value = "This will contain the instructions on how to pay the funds. Please see the [Collections from Senders](https://github.com/bitpesa/api-documentation/blob/master/additional-features.md#collections-from-senders) in the API documentation on what to expect here.")
  public Object getInstructions() {
    return instructions;
  }

  public PayinMethod provider(String provider) {
    this.provider = provider;
    return this;
  }

   /**
   * Describes which provider to use for collection. Please see the [Collections from Senders](https://github.com/bitpesa/api-documentation/blob/master/additional-features.md#collections-from-senders) in the API documentation on the valid values
   * @return provider
  **/
  @ApiModelProperty(value = "Describes which provider to use for collection. Please see the [Collections from Senders](https://github.com/bitpesa/api-documentation/blob/master/additional-features.md#collections-from-senders) in the API documentation on the valid values")
  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayinMethod payinMethod = (PayinMethod) o;
    return Objects.equals(this.type, payinMethod.type) &&
        Objects.equals(this.inDetails, payinMethod.inDetails) &&
        Objects.equals(this.outDetails, payinMethod.outDetails) &&
        Objects.equals(this.instructions, payinMethod.instructions) &&
        Objects.equals(this.provider, payinMethod.provider);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, inDetails, outDetails, instructions, provider);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayinMethod {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    inDetails: ").append(toIndentedString(inDetails)).append("\n");
    sb.append("    outDetails: ").append(toIndentedString(outDetails)).append("\n");
    sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

