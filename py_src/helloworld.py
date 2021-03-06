from random import randint
from sklearn.linear_model import LinearRegression
import matplotlib.pyplot as plt
from scipy import stats
TRAIN_SET_LIMIT = 100
TRAIN_SET_COUNT = 100

TRAIN_INPUT = list()
tp = list()
for i in range(100):
    tp.append(i)
TRAIN_OUTPUT = list()
for i in range(TRAIN_SET_COUNT):
    a = randint(0, TRAIN_SET_LIMIT)
    b = randint(0, TRAIN_SET_LIMIT)
    c = randint(0, TRAIN_SET_LIMIT)
    
    op = 1.*a + (2.*b) + (4.*c)
    
    TRAIN_INPUT.append([a, b, c])
    TRAIN_OUTPUT.append(op)

predictor = LinearRegression(n_jobs=-1)
predictor.fit(X=TRAIN_INPUT, y=TRAIN_OUTPUT)


X_TEST = [[10, 20, 30]]
outcome = predictor.predict(X=X_TEST)
coefficients = predictor.coef_
print('Outcome : {}\nCoefficients : {}'.format(outcome, coefficients))
