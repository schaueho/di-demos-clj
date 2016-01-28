; ---------------------------------------------------
(ns playitloud.proto-player
  (:require [playitloud.output-device :as output]
            [playitloud.musiccoll :as mc]))

(defn proto-play [output-device randomize]
  (let [songs (mc/get-songs)
        songs (if randomize (shuffle songs) songs)]
    (map (fn [song]
           (output/blare output-device song))
         songs)))


