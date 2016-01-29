(ns playitloud.output-multi)

(defmulti blare
  "Play sounds on an output device"
  (fn [device sound]
    device))
