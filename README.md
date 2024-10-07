# Phonebook

In this project, a variety of sorting and search algorithms are implemented, one of which
is recursive.

## Stage 1/4: A needle in the hay

In this stage, two text files are given. The source file contains a huge amount
of names and phone numbers, and names file contains some names.

When the program is run, it reads both files and saves the lines in a list of strings, 
calculates the number of names which are available in the source file.
It also calculates the amount of time for this search, and prints the result at the end.

Stage implementation: [LinearSearch.kt](src/main/kotlin/LinearSearch.kt)

The source file looks like:
        
    ............ 
    60360455 Darbie Kentigera
    45377330 Malissia Vasilis
    6620384 Rivi Perceval
    94626609 Pippa Elizabet
    97030690 Mil Esmeralda
    59470770 Marylinda Coussoule
    44708092 Lolly Dugan
    72437298 Annelise Ranjiv
    ............ 
 
The names file looks like:

    ............
    Elly Amabil
    Georgine Botsford
    Cathleen Citron
    Quintana Hugon
    Jewel Gustie
    Mathilda Gan
    Merilee Howlan
    Carleen Zumwalt
    ............

**Example output:**

    Start searching...
    Found 500 / 500 entries. Time taken: 1 min. 56 sec. 328 ms.


