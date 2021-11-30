male(john). male(mike). female(anna). female(jane).
parent(mike, john). parent(mike, anna).
parent(mike, anna). parent(jane, anna).
father(X, Y) :- male(X), parent(X, Y).
