  Feature: Product´s Detail
    As a user with a registered account on the OLX page
    I want to verify a product´s detail from the home page

    Background:
      Given the user must have set his location
      And must have been logged in to the system
      And must be in to the home page

        Scenario: Display of the image´s carousel of a product from the category section on the home page
            When clicks on a category button on the home page
            And selects a product type whithin the category
            And clicks on a product publication
            And clicks on the photo carousel
            And slides the images
            Then the product´s photos are displayed on the carousel

        Scenario: Display of the image´s carousel of a product from the home page
            When clicks on a product publication
            And clicks on the photo carrousel
            And slides the images
            Then the product´s photos are displayed on the carousel



