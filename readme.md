# party planning service

web application for party planning, 1/5/2018

**By Natalia Telpukhova**

## Description

Web application that prompts user for party details and returns the estimated cost.

### Specs
| Behavior | Input | Output |
| :-------------     | :------------- | :------------- |
| returns cost on guest count for cheap party | guest Count = 10, food = budget, drinks = budget | 200 |
| returns cost on guest count for standard party | guest Count = 10, food = standard, drinks = standard | 400 |
| returns cost on guest count for premium party | guest Count = 10, food = premium, drinks = premium | 600 |
| returns cost on guest count for mixed party | guest Count = 10, food = standard, drinks = premium | 500 |
| returns cost on guest count for cheap party with dJ | guest Count = 10, Entertainment = dj, food = budget, drinks = budget | 300 |
| returns cost on guest count for cheap party with band | guest Count = 10, Entertainment = dj, food = budget, drinks = budget | 400 |
| dj is free when the first coupon is used | guest Count = 160, Entertainment = dj, food = budget, drinks = budget, coupon number = 1234 | 3200 |
| reduces cost by $50 when the second coupon is used | guest Count = 10, food = budget, drinks = budget, coupon number = 5678 | 150 |

## Setup

* clone repository
* run App.java

## Technologies Used

Java

Copyright (c) 2017 Natalia Telpukhova
