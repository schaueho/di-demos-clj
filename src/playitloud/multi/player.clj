(ns playitloud.multi.player
  (:require [playitloud.multi.output-device :refer [blare]]
            [playitloud.musiccoll :as mc]))

(defn play [output-device randomize]
  (let [songs (mc/get-songs)
        songs (if randomize (shuffle songs) songs)]
    (map (fn [song]
           (blare output-device song))
         songs)))


