#lang racket

(define (sumOfSquares x y) (+ (* x x) (* y y)) )

(define (funct a b c)
  (cond ((and (< a b) (< a c)) (sumOfSquares b c))
        ((and (< b a) (< b c)) (sumOfSquares a c))
        (else (sumOfSquares a b))))
