# Explanation of Relationships:
## Inheritance:
Apartment, House, and Shop inherit from RentableProperty.

## Composition:
The Customer class contains a list of RentedProperty instances.
RentedProperty is an inner class of Customer and has RentableProperty and Contract attributes.

## Aggregation:
RentableProperty and Contract are used within Customer but can exist independently.
