# Remittance API Documentation

This documentation provides an overview of the Remittance API and its available operations.

## Introduction

The Remittance API allows you to remit funds to local recipients from the diaspora with ease. It offers various operations to manage transactions and account information.

## API Definition

### Changelog

View the [Changelog](CHANGELOG.md) for information about recent updates and changes to the API.

## Operations

### Get Account Balance

Get the balance of your own account.

#### Request

- **URL**: `https://sandbox.momodeveloper.mtn.com/remittance/v1_0/account/balance`

##### Request Headers

- **Authorization** (Required): Bearer Authentication Token generated using the CreateAccessToken API Call.
- **X-Target-Environment** (Required): The identifier of the Wallet Platform system where the transaction shall be processed. This parameter is used to route the request to the Wallet Platform system that will initiate the transaction.

#### Response: 200 OK

- **Content Type**: `application/json`
- **Response Body**:

```json
{
    "availableBalance": "string",
    "currency": "string"
}
- **availableBalance** (false): The available balance of the account.
- **currency** (false): ISO4217 Currency.

#### Response: 400 Bad Request

- **Description**: Bad request, e.g. invalid data was sent in the request.

#### Response: 500 Internal Server Error

- **Description**: Internal error. The returned response contains details.

### Definitions

#### Balance

- **availableBalance** (false): The available balance of the account.
- **currency** (false): ISO4217 Currency.

#### ErrorReason

- **code** (false): Error code.
- **message** (false): Error message.

## Try It

You can use the Try It feature to test the Get Account Balance operation.

## Contributing

You are welcome to contribute to this documentation to make it more helpful and comprehensive. If you have any suggestions or find any issues, please create a pull request or raise an issue.

## License

This documentation is available under the (https://momodeveloper.mtn.com/)
