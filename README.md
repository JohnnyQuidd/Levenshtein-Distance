# Levenshtein-Distance
Levenshtein Distance is string metric to measure the distance between two strings. In other words, to determine the minimum number of single characters edits needed to perform to transform one string into the another. Element operations are **insertions**, **deletions**, and **substitutions**. Although there are many approaches to this specific problem, the solution will be provided using Dynamic Programming approach.

![Levenshtein-Distance](http://www.levenshtein.net/images/levenshtein_meilenstein_matrix.gif)

**Time Complexity    O(m * n)**

**Space Complexity   O(m * n)**

m - Number of chars of the first string

n - Number of chars of the second string

Appliances of Levenshtein Distance are quite commonly seen in *spell checkers software*, *optical character recognition*, a variation of algorithm is used in *bioinformatics* to compute protein substitution in DNA chain.

## Motivation
Levenshtein Distance is used by German scientists to predict the pattern of "random" generated numbers by humans, which played a major part in understanding how each human being not knowingly uses the unique pattern to write what is initially thought to be a random sequence of numbers.

[Scientific article](https://journals.plos.org/plosone/article?id=10.1371%2Fjournal.pone.0041531&fbclid=IwAR1K1n3e4vOAeKhxZc-UGroLD1_64vG1mKdn53pfd4HbIkfCgGhi1o0sv5Y)

[More about the algorithm](https://en.wikipedia.org/wiki/Levenshtein_distance)
