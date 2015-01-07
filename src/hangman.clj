(ns hangman)

((fn [w g]
			(println (map #(if (g %) % "-") w))
			(recur w (conj g (first (read-line))))) "hangman" #{})