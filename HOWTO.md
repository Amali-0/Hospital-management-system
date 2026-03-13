# My Hospital System - Activity 3

## What I did in this project
I took my hospital code from the last activity and made it better. Before, all the doctor and patient names were already typed into the code manually. Now, when you run the program, it actually asks you to type in the name and ID for the doctor and the patient yourself for the info to be displayed.


## How I handled errors

I didn't want the program to just crash if someone typed in the wrong thi\ng, so I used a try-catch block.

The main thing I'm checking for is the InputMismatchException. This is there for the ID parts ,if the program asks for a number and the user types a name or a letter by mistake, the "catch" block will just show a quick error message instead of the whole program breaking.

I also added a finally block at the very end to close the Scanner. I did this to make sure the program (cleans up) and doesn't leave any background processes running after it's done.






