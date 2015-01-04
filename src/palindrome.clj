(ns palindrome (:use [clojure.java.io] :use [clojure.string :only (join split) :as str]))


(defn palindrome? [word] (= word (apply str (reverse word))))

(with-open [rdr (reader "norsk.txt")]
	(doseq [line (line-seq rdr)]
		(let[word ((str/split line #" ") 0)]
		(if (palindrome? word) (println word )))))

