(ns playitloud.multi.output-device)

(defmulti blare
  "Play sounds on an output device"
  (fn [device sound]
    device))
