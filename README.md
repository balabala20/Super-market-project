Supermarket Shopping and Billing – Java Console Application

## Overview  
This is a Java console-based supermarket shopping and billing application.  
It simulates a simple supermarket where a user can view available items, select products with quantities, and generate a formatted bill with the final total.

## Features  
- Display list of supermarket items with their prices.  
- Add items to a virtual cart by name.  
- Store selected items and quantities using `HashMap<String, Integer>`.  
- Automatically calculate total price per item and overall total.  
- Generate a neat text-based bill with user name, items, quantities, and totals.

## Tech Stack & Concepts  
- **Language**: Java  
- **Paradigm**: Object-Oriented Programming (OOP)  
- **Core Concepts Used**:  
  - Classes and objects (`Main`, `Itemslist`, `ChoosedItems`, `AddingItems`, `GenerateBill`)  
  - `HashMap` for storing items, prices, quantities, and item-wise totals  
  - `Scanner` for user input  
  - Loops and conditionals for menu-driven interaction and validation

## Project Structure  
- `Main.java`  
  - Entry point of the application.  
  - Handles user interaction, shows items list, reads user choices, and manages the shopping loop.  
- `Itemslist.java`  
  - Maintains the list of available items and their prices using a `HashMap<String, Integer>`.  
- `AddingItems.java`  
  - Populates `Itemslist` with default supermarket items and their prices.  
- `ChoosedItems.java`  
  - Stores selected items and their quantities.  
  - Also stores and updates total price for each selected item using `HashMap`.  
- `GenerateBill.java`  
  - Generates and prints the final bill with user name, items, quantities, item totals, and grand total.

## How It Works  
1. The application starts and welcomes the user.  
2. The user is asked to enter their name.  
3. The program displays the items list with prices.  
4. The user can:  
   - Enter an item name to add it to the cart.  
   - Enter quantity for that item.  
   - Repeat for multiple items.  
5. At any point, the user can type `buy` to generate the bill or `0` to exit.  
6. On `buy`, the program prints a formatted bill including all selected items with their quantities and total price.

## How to Run  
1. Ensure Java (JDK) is installed on your system.  
2. Place all `.java` files in the same folder.  
3. Compile the files:  
   ```bash
   javac Main.java
   ```
4. Run the program:  
   ```bash
   java Main
   ```
5. Follow the on-screen instructions to shop and generate the bill.

## Possible Improvements  
- Input validation for invalid item names and non-numeric quantities.  
- Option to remove items or update quantity in the cart.  
- Persist items and prices using a file or database.  
- Add discounts, offers, and taxes in the billing logic.  
- Create a GUI version using JavaFX or Swing in the future.

## Learning Outcomes  
- Practiced structuring a small project into multiple classes.  
- Understood how to use `HashMap` to model real-world data like inventory and cart.  
- Improved comfort with user input handling and control flow in Java.[1]

