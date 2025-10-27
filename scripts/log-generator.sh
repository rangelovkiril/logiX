#!/usr/bin/bash

logfile="/home/kiril/code/school/oop/logix/logs/example.log"
interval=2

while true; do
  timestamp=$(date '+%Y-%m-%d %H:%M:%S')
  echo "[$timestamp] [PID $$] Simulated event OK" >> "$logfile"
  sleep "$interval"
done
