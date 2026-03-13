## My hospital System -Activity 3-
## What I did in this project
I took my hospital code from the last activity and made it better. Before, all the doctor and patient names were already typed into the code. Now, when you run the program, it actually asks you to type in the name and ID for the doctor and the patient yourself.

## How I handled errors
I didn't want the program to just crash if someone typed in the wrong thing, so I used a try-catch block.
whereby he main thing I'm checking for is the InputMismatchException. This is there for the ID parts—if the program asks for a number and the user types a name or a letter by mistake, the "catch" block will just show a quick error message instead of the whole program breaking.

## Exceptions implement

I added a try-catch block to handle errors so the program doesn't just crash if someone types in the wrong thing.

InputMismatchException: I used this mainly for the ID parts. If the program asks for a number and the user accidentally types a name or a letter, the "catch" block will show a quick error message instead of the whole program breaking. This keeps the code running safely even if there's a typo.

Finally block: I put this at the very end to close the Scanner. This makes sure the program "cleans up" its resources and doesn't leave any background processes running once the session is finished.







