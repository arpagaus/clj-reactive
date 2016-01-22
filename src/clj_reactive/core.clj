(ns clj-reactive.core
  (:gen-class)
  (:require [clojure.core.reducers :as r]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn fizz-buzz
  [value]
  (cond
   (and (= (mod value 3) 0) (= (mod value 5) 0)) "FizzBuzz"
   (= (mod value 3) 0) "Fizz"
   (= (mod value 5) 0) "Buzz"
   :else value))

(defn fizz-buzz-range
  [end]
  (map fizz-buzz (range 1 (+ end 1))))

(doall (fizz-buzz-range 5))
