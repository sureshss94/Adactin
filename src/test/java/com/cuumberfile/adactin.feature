 Feature: Hotel Booking In Adactin Application

@SmokeTest
Scenario Outline: Login page

Given user Launch The Application

When user Enter The Username In "<Username>" Field

And user Enter the Password In "<Password>" Field

Then user Click On The Login Button And It Navigates to Search Hotel Page

Examples:
|Username|Password|
|starc|123fgh|
|suresh|rtyui|
|Sureshjava|9L22A7|

@Ad1
Scenario: Search Hotel Page

When user Select The "Melbourne"

And user Select The Hotel

And user Select The Room Type

And user Select The No Of Rooms

And user Enter The Checkin Date

And user Enter The Checkout Date 

And user Select The No Of Adults

And user Select The No Of Children

Then user Click On the Search Button And It Navigate To Select Hotel Page


@Ad2
Scenario: Hotel Select Page

When User Click on the Select radio Button

Then user Click on the Search Button And It Navigate To Book AHotel Page


@Ad3
Scenario: Book A Hotel Page

When user Enter the First Name

And user Enter the Last Name

And user Enter The Billing Address

And user Enter The Credit Card Detail

And user Select Card Type

And user Select Expiry Date And Year

And user Enter The CVV Number

And user Click on the Booknow Button And It Navigate To Booking Confirmation page

Then user Click The Logout Button