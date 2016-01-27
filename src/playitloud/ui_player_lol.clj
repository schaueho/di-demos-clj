; -----------------------------------------------------------
(ns playitloud.ui-player-lol
  (:require [playitloud.play-config :refer [select-playfn]]
            [playitloud.musiccoll :refer [get-songs]]))

;; (defn lol-play-pressed [speaker randomize]
;;   (println "User pressed play")  
;;   (let [blarefn (condp = speaker
;;                   :speaker   speaker/blare
;;                   :headphone headphone/blare
;;                   :stream    streamer/blare)
;;         playfn (lol-play blarefn get-songs)]
;;     (playfn randomize)))

(defn lol-config-play-pressed [speaker randomize]
  (let [playfn (select-playfn speaker)]
    (playfn randomize)))
