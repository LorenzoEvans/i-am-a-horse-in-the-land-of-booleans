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
    (= (divides? n 3) 0) "fizz"
    (= (divides n 5) 0) "buzz"
    (= (divides n 15) 0) "gotcha!"
    :else ""))    

(defn teen? [age]
  ":(")

(defn not-teen? [age]
  ":(")

(defn generic-doublificate [x]
  ":(")

(defn leap-year? [year]
  ":(")

; '_______'
