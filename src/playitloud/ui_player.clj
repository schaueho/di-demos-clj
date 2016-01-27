; -----------------------------------------------------------
(ns playitloud.ui-player
  (:require [playitloud.ho-player :as ho :refer [ho-play]]
            [playitloud.speaker :as speaker]
            [playitloud.headphone :as headphone]
            [playitloud.blue-streamer :as streamer]
            [playitloud.musiccoll :refer [get-songs]]))

(defn play-pressed [speaker randomize]
  (println "User pressed play")
  (condp = speaker
    :speaker   (ho-play speaker/blare get-songs randomize)
    :headphone (ho-play headphone/blare get-songs randomize)
    :stream    (ho-play streamer/blare get-songs randomize)))

