(ns clj-reactive.core-test
  (:require [clojure.test :refer :all]
            [clj-reactive.core :refer :all]))

(deftest fizz-buzz-test
    (is (= "12Fizz4Buzz" (clojure.string/join (fizz-buzz-range 5)))))

(deftest fizz-buzz-test-performance
    (is (= 1000000 (time (count (fizz-buzz-range 1000000)))))
    (is (= 1000000 (time (count (fizz-buzz-range 1000000)))))
    (is (= 1000000 (time (count (fizz-buzz-range 1000000)))))
  )

(run-tests)
