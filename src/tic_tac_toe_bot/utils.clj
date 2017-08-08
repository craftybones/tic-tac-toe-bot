(ns tic-tac-toe-bot.utils)

(def winning-combinations
  #{#{1 2 3}
    #{4 5 6}
    #{7 8 9}
    #{1 4 7}
    #{2 5 8}
    #{3 6 9}
    #{1 5 9}
    #{3 5 7}})

(def is-superset? every?)

(defn has-won? [player-moves]
  (let [player-moves-is-a-superset-of-at-least-some?
        (partial some (partial is-superset? player-moves))]
    (player-moves-is-a-superset-of-at-least-some? winning-combinations)))
