(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (or (= x nil) (= x false)) false true))

(defn abs [x]
  (if (neg? x) (+ x (* x -2)) x))

(defn divides? [divisor n]
  (if (= (mod n divisor) 0) true false))

(defn fizzbuzz [n]
  (cond 
    (== (mod n 15) 0) "gotcha!"
    (== (mod n 3) 0) "fizz"
    (== (mod n 5) 0) "buzz"
    :else ""))    

(defn teen? [age]
  (if (< 12 age 20) true false)) ; < is greater than

(defn not-teen? [age] ;  20 > 12 < age
 (not (teen? age))) ; < 12 20 


(defn sign [z]
  (if (< z 0)
    "-"
    "+"))
(defn abs* [n]
  (if (< 0 n) n (/ (* n n) 2)))

(defn generic-doublificate [x]
  (cond 
    (number? x) (* x 2)
    (empty? x) nil
    (or (list? x) (vector? x)) (* 2 (count x))
    :else true))  

(defn leap-year? [year]
 (cond 
  (zero? (mod year 400)) true
  (zero? (mod year 100)) false
  (zero? (mod year 4)) true
  :else false))   

; '_______'
