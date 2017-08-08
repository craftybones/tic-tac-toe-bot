(ns tic-tac-toe-bot.utils-test
  (:require [clojure.test :refer :all]
            [tic-tac-toe-bot.utils :refer :all]))

(deftest winning-conditions-test
  (testing "All valid combinations are present"
    (is (= 8 (count winning-combinations)))
    (are [combination] (->> combination
                            (contains? winning-combinations)
                            true?)
      #{1 2 3}
      #{4 5 6}
      #{7 8 9}
      #{1 4 7}
      #{2 5 8}
      #{3 6 9}
      #{1 5 9}
      #{3 5 7})))

(deftest has-won-test
  (testing "Simple passing row conditions"
    (are [player-moves] (true? (has-won? player-moves))
      #{1 2 3}
      #{4 5 6}
      #{7 8 9})))