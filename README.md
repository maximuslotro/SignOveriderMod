<p align="center">
  <a href="https://github.com/maximuslotro/SignOveriderMod/releases" target="_blank">
    <img alt="release" src="https://img.shields.io/github/v/release/maximuslotro/SignOveriderMod?color=56bcd3" />
  </a>
  <a href="https://github.com/maximuslotro/SignOveriderMod/releases" target="_blank">
    <img alt="downloads" src="https://img.shields.io/github/downloads/maximuslotro/SignOveriderMod/total?color=56bcd3" />
  </a>
  <a href="https://github.com/maximuslotro/SignStory/main/LICENSE.md" target="_blank">
    <img alt="license" src="https://img.shields.io/badge/License-MIT-blue.svg?style=flat" />
  </a>
</p>

# Sign Overider Mod
![Minecraft 1.7.10](https://img.shields.io/badge/Minecraft-1.7.10-green.svg?style=flat)

## About

Easily disable the sign gui from appearing when placing a sign. Only one simple command to toggle this functionality (/SignOverider). Should be compatable with almost all mods.

## License
* Sign Overider Mod
  - (c) 2022 maximuslotro
  - [![License](https://img.shields.io/badge/License-MIT-blue.svg?style=flat)](https://raw.githubusercontent.com/maximuslotro/SignOveriderMod/main/LICENSE.md)

## Downloads

Downloads can be found on [github](https://github.com/maximuslotro/SignOveriderMod/releases).

## Installation

You install this mod by putting it into the `minecraft/mods/` folder. It has no additional hard dependencies.

## Building

1. Clone this repository via
  - SSH `git clone git@github.com:maximuslotro/SignOveriderMod.git` or
  - HTTPS `git clone https://github.com/maximuslotro/SignOveriderMod.git`
2. Setup workspace
  - Decompiled source `gradlew setupDecompWorkspace`
  - Obfuscated source `gradlew setupDevWorkspace`
  - CI server `gradlew setupCIWorkspace`
3. Build `gradlew build`. Jar will be in `build/libs`
4. For core developer: Setup IDE
  - IntelliJ: Import into IDE and execute `gradlew genIntellijRuns` afterwards
  - Eclipse: execute `gradlew eclipse`

