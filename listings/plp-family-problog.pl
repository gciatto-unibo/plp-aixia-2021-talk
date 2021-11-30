male(john).
0.80::male(mike).
0.65::female(anna).
0.90::female(jane).
0.60::parent(mike, john).
0.65::parent(mike, anna).
0.85::parent(mike, anna).
0.75::parent(jane, anna).
0.95::father(X, Y) :- male(X), parent(X, Y).