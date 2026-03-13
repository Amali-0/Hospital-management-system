# My Hospital System - Activity 3

## What I did in this project
I took my hospital code from the last activity and made it better. Before, all the doctor and patient names were already typed into the code. Now, when you run the program, it actually asks you to type in the name and ID for the doctor and the patient yourself.

## How I handled errors
I used "Exception Handling" to make sure the program doesn't crash if the user makes a mistake. 

- I used a **try-catch** block to wrap my code. 
- I added a specific check for **InputMismatchException**. This is for when the program expects a number (like for an ID) but the user accidentally types a word instead.
- I used a **finally** block at the end to close the Scanner. This is just to make sure the program cleans up its resources properly after it finishes.

