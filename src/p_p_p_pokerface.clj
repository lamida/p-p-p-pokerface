(ns p-p-p-pokerface)

(defn rank [card]
  (let [[r _] card 
        card-map {"2" 2
                  "3" 3
                  "4" 4
                  "5" 5
                  "6" 6
                  "7" 7
                  "8" 8
                  "9" 9
                  "T" 10
                  "J" 11
                  "Q" 12
                  "K" 13
                  "A" 14}] 
    (get card-map (str r))))

(defn suit [card]
  (let [[_ s] card] 
    (str s)))

(defn pair? [hand]
  (let [ct (get (frequencies (map rank hand)) 2)]
    (if (nil? ct) false (= ct 2))))

(defn three-of-a-kind? [hand]
  (let [ct (get (frequencies (map rank hand)) 2)]
    (if (nil? ct) false (= ct 3))))

(defn four-of-a-kind? [hand]
  (let [ct (get (frequencies (map rank hand)) 2)]
    (if (nil? ct) false (= ct 4))))

(defn flush? [hand]
  nil)

(defn full-house? [hand]
  nil)

(defn two-pairs? [hand]
  nil)

(defn straight? [hand]
  nil)

(defn straight-flush? [hand]
  nil)

(defn value [hand]
  nil)
