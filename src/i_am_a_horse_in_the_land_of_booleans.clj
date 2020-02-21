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
                      ;  age > 20 > 12
  (if (< age 12) true 
                 (if (< 19 age) true false))) ; < 12 20 

(defn generic-doublificate [x]
  ":(")

(defn leap-year? [year]
  ":(")

; '_______'
