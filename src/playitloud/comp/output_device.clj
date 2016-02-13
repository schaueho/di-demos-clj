(ns playitloud.comp.output-device)

(defprotocol OutputDevice
  (blare [device sound])
  (inc-volume [device])
  (dec-volume [device]))

  
