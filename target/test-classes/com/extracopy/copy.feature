Feature: Hotel Booking In Adactin Application


Scenario: Login page

Given user Launch The Application

When user Enter The Username In Username Field

And user Enter the Password In Password Field

Then user Click On The Login Button And It Navigates to Search Hotel Page



Scenario: Search Hotel Page

When user Select The Hotel Location 

And user Select The Hotel

And user Select The Room Type

And user Select The No Of Rooms

And user Enter The Checkin Date

And user Enter The Checkout Date 

And user Select The No Of Adults

And user Select The No Of Children

Then user Click On the Search Button And It Navigate To Select Hotel Page



Scenario: Hotel Select Page

When User Click on the Select radio Button

Then user Click on the Search Button And It Navigate To Book AHotel Page



Scenario: Book A Hotel Page

When user Enter the First Name

And user Enter the Last Name

And user Enter The Billing Address

And user Enter The Credit Card Detail

And user Select Card Type

And user Select Expiry Date And Year

And user Enter The CVV Number

Then ususer Click on the Booknow Button And It Navigate To Booking Confirmation page