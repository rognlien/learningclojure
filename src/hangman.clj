(ns hangman)

(defn guess [word guessed]
	(println (map #(if (guessed %) % "-") word))
	(let [guessed-char (first (read-line)) guessed (conj guessed guessed-char)]
		(guess word guessed)))


(guess "hangman" #{})