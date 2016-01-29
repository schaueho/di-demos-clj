(ns playitloud.multi-player
  (:require [playitloud.output-multi :refer [blare]]
            [playitloud.musiccoll :as mc]))

(defn multi-play [output-device randomize]
  (let [songs (mc/get-songs)
        songs (if randomize (shuffle songs) songs)]
    (map (fn [song]
           (blare output-device song))
         songs)))


