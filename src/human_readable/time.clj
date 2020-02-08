(ns human-readable.time)
(defn human-readable
  [x]
  (let [hours    (quot x 3600)
        minutes  (quot (rem x 3600) 60)
        seconds  (rem  (rem x 3600) 60)]
    (format "%02d:%02d:%02d" hours minutes seconds)))