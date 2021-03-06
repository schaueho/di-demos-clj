(ns playitloud.proto.speaker
  (:require [playitloud.proto.output-device :as output :refer :all]))

(defrecord Speaker [volume]
    OutputDevice
  (blare [_ sound]
    (let [result (str "Speaker plays " sound)]
      (println result)
      result))
  (inc-volume [speaker]
    (update speaker volume inc))
  (dec-volume [speaker]
    (update speaker volume dec))) 
