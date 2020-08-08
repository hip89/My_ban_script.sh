[![Build Status](https://travis-ci.com/kevalpatel2106/crypto-wallet.svg?branch=master)](https://travis-ci.com/kevalpatel2106/crypto-wallet) [![codecov](https://codecov.io/gh/kevalpatel2106/crypto-wallet/branch/master/graph/badge.svg)](https://codecov.io/gh/kevalpatel2106/crypto-wallet)

# Crypto Wallet

#### Demo application for displaying the Bitcoin transaction in Crypto Wallet.

## Features:
- Uses android architecture components.
- Follows MVVM architecture pattern.
- Demonstrates testing frameworks like JUnit, Roboelectric and Espresso tests
- Uses dagger heavily to provide clear separation between different architecture layers. Helps to write testable code.
- Mocking shared preferences and web server to write accurate tests.

> This application is just a demonstration for the possible design of crypto wallet.

## Overview 

- Application uses the Multi Address api of the popular crypto wallet [Blockchain](https://www.blockchain.com). Blockchain multi address api gives the list of BTC transaction for the given wallet address. See the API [documentation](https://www.blockchain.com/api/blockchain_api).
- You can replace the address to retrieve.
- The dashboard activity shows the number of transaction, available balance, total sent/received amount in BTC and list of each transactions (amount in Satoshi).

## How to run tests?
- Make sure you connect physical device or run an emulator before running the UI tests.
- To run tests, run following command:
```bash
./gradlew cAT
```

## Acknowledgement:
- 