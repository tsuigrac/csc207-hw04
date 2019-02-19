# csc207-hw04

Assignment 4 by Grace Tsui and Yilan Dong

Part A: Population size of 10 (or 9)

Experiment 1: 1 Cooperator, 9 Defectors
We predict that the Defectors will always replace all the Cooperators
because the small population base of the Cooperators already makes it easy
for them to go extinct, and they are more likely to give up their energy so
they are less likely to reproduce in the first place. 

Results:
1. Mean Cooperation Probability = 0.0
2. Mean Cooperation Probability = 0.0
3. Mean Cooperation Probability = 0.0
4. Mean Cooperation Probability = 0.0
5. Mean Cooperation Probability = 0.0
6. Mean Cooperation Probability = 0.0
7. Mean Cooperation Probability = 0.0
8. Mean Cooperation Probability = 0.0
9. Mean Cooperation Probability = 0.0
10. Mean Cooperation Probability = 0.0

Average: 0.0

The results supported our predictions because all probabilities were 0.


Experiment 2: 1 Defector, 9 Cooperators
We predict that the Defectors will likely be totally replaced during some
reproduction of the Cooperators because its base population is too small,
so the Mean Cooperation Probability will be close to 1. However, there is
also a possibility that the Defectors will get a chance to reproduce and
replace the Cooperators, and may replace all the Cooperators. 

Results:
1. Mean Cooperation Probability = 1.0
2. Mean Cooperation Probability = 0.0
3. Mean Cooperation Probability = 1.0
4. Mean Cooperation Probability = 0.0
5. Mean Cooperation Probability = 1.0
6. Mean Cooperation Probability = 1.0
7. Mean Cooperation Probability = 1.0
8. Mean Cooperation Probability = 0.0
9. Mean Cooperation Probability = 1.0
10. Mean Cooperation Probability = 1.0

Average: 0.7

The results did support our predictions, because most of the time the
Cooperators replaced the Defectors completely, but there were also times
when the Defectors replaced the Cooperators completely.


Experiment 3: Population sizes of 3 each
We predict that the Defector population will go up at the expense of the
Cooperators and Partial Cooperators. This is because the Defectors always
take energy from the others and never have to give up any, so they will
reproduce more than others and create more Defectors. Since the population
of the others are so small, they will be more likely to be replaced by
Defectors. For the same reason, we predict that Partial Cooperators will
have a higher population than Cooperators because they give out energy less
frequently. Since the sample size is so small, it will be likely that the
Cooperators and Partial Cooperators will go extinct, and so the mean
cooperation probability will be close to 0.

Results:
1. Mean Cooperation Probability = 0.0
2. Mean Cooperation Probability = 0.0
3. Mean Cooperation Probability = 0.0
4. Mean Cooperation Probability = 0.0
5. Mean Cooperation Probability = 0.0
6. Mean Cooperation Probability = 0.5
7. Mean Cooperation Probability = 0.0
8. Mean Cooperation Probability = 0.0
9. Mean Cooperation Probability = 1.0
10. Mean Cooperation Probability = 0.0

Average: 0.15

These results support our prediction because the mean cooperation
probabiliy was 0 most of the time since the Defectors wiped out the rest of
the population. However, sometimes the organism type that dominated were the
Cooperators or Partial Cooperators. We also didn't expect that for each
final population, only one organism type would remain. 


PART B: Population sizes of 100 (or 99)

Experiment 1: 1 Cooperator, 99 Defectors
We predict that the Defectors will always replace all the Cooperators
because the small population base of the Cooperators already makes it easy
for them to go extinct, and they are more likely to give up their energy so
they are less likely to reproduce in the first place. 

Results:
1. Mean Cooperation Probability = 0.0
2. Mean Cooperation Probability = 0.0
3. Mean Cooperation Probability = 0.0
4. Mean Cooperation Probability = 0.0
5. Mean Cooperation Probability = 0.0
6. Mean Cooperation Probability = 0.0
7. Mean Cooperation Probability = 0.0
8. Mean Cooperation Probability = 0.0
9. Mean Cooperation Probability = 0.0
10. Mean Cooperation Probability = 0.0

Average: 0.0

The results supported our predictions because all probabilities were 0.


Experiment 2: 1 Defector, 99  Cooperators
We predict that the Defectors will likely be totally replaced most of the
time. Compared to Part A, it is less likely that the Defectors will get a
chance to reproduce at all, so the Mean Cooperation Probabiliy for these
experiments should be greater than the probabilities of Part A Experiment
2. 

Results:
1. Mean Cooperation Probability = 1.0
2. Mean Cooperation Probability = 1.0
3. Mean Cooperation Probability = 1.0
4. Mean Cooperation Probability = 1.0
5. Mean Cooperation Probability = 1.0
6. Mean Cooperation Probability = 0.0
7. Mean Cooperation Probability = 1.0
8. Mean Cooperation Probability = 1.0
9. Mean Cooperation Probability = 1.0
10. Mean Cooperation Probability = 1.0

Average: 0.9

The results did support our predictions, because most of the time the
Cooperators replaced the Defectors completely, and the average of the
probabilities was greater than Part A's. 


Experiment 3: Population sizes of 33 each
We predict that the Defector population will go up at the expense of the
Cooperators and Partial Cooperators. This is because the Defectors always
take energy from the others and never have to give up any, so they will
reproduce more than others and create more Defectors. Since the population
of the others are so small, they will be more likely to be replaced by
Defectors. For the same reason, we predict that Partial Cooperators will
have a higher population than Cooperators because they give out energy less
frequently. 

Results:
1. Mean Cooperation Probability = 0.0
2. Mean Cooperation Probability = 0.010101010101
3. Mean Cooperation Probability = 0.020202020202
4. Mean Cooperation Probability = 0.005050505050
5. Mean Cooperation Probability = 0.0
6. Mean Cooperation Probability = 0.015151515151
7. Mean Cooperation Probability = 0.060606060606
8. Mean Cooperation Probability = 0.020202020202
9. Mean Cooperation Probability = 0.035353535353
10. Mean Cooperation Probability = 0.040404040404

Average: 0.02

These results support our prediction because the probabilities were very
low since Defectors dominated the final population.


Summary:
In conclusion, we found that the Defectors usually dominated the final
population if the base population of all three types were the same, or if
the Defectors' base population was greater than the others. As long as the
Defectors exist, even if there is only 1 of them compared to 99 others,
there is still a chance that Defectors will wipe out the others. To let
Cooperators succeed in this simulation, the Cooperators had to have a much
higher population compared to the defectors. 



Bonus:

Add mutation:
We predict that since the Cooperators and Partial-Cooperators can no longer
be totally wiped out, since there's always a possibility of Defectors
producing one of them when they reproduce, the mean cooperation probability
will be greater than what it was without mutations.
We performed tests on our updated code with 33 of each type of organism in
100 iterations, and we found that the Mean Cooperation Probability is
greater than without the possibility of mutations. More specifically, the
Mean is never 0, but can go up to 0.45 and averages around 0.2.


Change costs/benefits of cooperating
1. We updated the code so that whenever an organism cooperates, all its energy
is taken away and 8 random organisms gain one energy. We predict that since
Cooperators cooperate every time, they will always have 0 energy and never
get to reproduce. Therefore, they will probably get replaced when the
Partial Cooperators and Defectors reproduce, and so the Mean Cooperation
Probability will be very low. However, the Cooperators will never totally
get wiped out because of the mutation.
We found that our predictions were correct, with a Mean Cooperation
Probability of less than 10% each time we ran our code. Defectors always
greatly outnumbered the Partial Cooperators and Cooperators.


2. We changed the settings again and made it so that whenever an organism
cooperators, it gives out between 6 to 8 energy units to random
organisms. The amount of energy it gives is random, and it also only loses
one energy every time it cooperates. We predict that the Mean Cooperation
Probability increases because Cooperators would help the Defectors less
since they are giving them less energy, and so the Defectors would have
less of an advantage over Cooperators when it comes time to reproduce.
We found that there weren't any obvious changes to the Mean Cooperation
Probability, so our prediction was incorrect. This may be because when a
Cooperator gives out energy, it also may give energy to other
Cooperators. Therefore, when it gives less energy, although it helps the
Defectors and Partial Cooperators less, it also helps other Cooperators
less, and in the end Defectors and Partial Cooperators still have
reproductive advantages because they lose less energy.


Selective Replacement:
We predict that the Defectors will now outnumber the Cooperators and
PartialCooperators since they keep getting energy from the other organisms
and do not give up any energy.
Our prediction was incorrect, and it turns out that PartialCooperators
greatly dominate the Cooperators and Defectors. This is because when
Cooperators give out energy, they are at an increased likelihood to be
replaced. Because the Defectors always accept energy so often, they
reproduce the most often. However, this reproduction sets their energy to
0, so they get replaced by their offspring, which also has 0 energy
and is likely to be replaced.
