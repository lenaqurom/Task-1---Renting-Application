### UML Class Diagram:
https://drive.google.com/file/d/1gAzBXtaPSWX1sYpjAn4yYu3znunGbBmB/view

# Relationships
## Inheritance:

Person ← Customer

Person ← Owner

RentableProperty ← Apartment

RentableProperty ← House

RentableProperty ← Shop

Payment ← PayPalPayment

Payment ← CreditCardPayment
## Composition:

`Contract` composed of `Customer`, `Owner`, and `RentableProperty`

`RentedProperty` composed of `RentableProperty`
## Aggregation:

`Customer` aggregated with `RentedProperty`

`Owner` aggregated with `RentableProperty`
## Association:

`Customer` associated with `RentedProperty`

`Customer` associated with `Contract`

`Owner` associated with `Contract`
