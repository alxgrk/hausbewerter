package react.data

import react.RProps

// INTERFACES

interface ParallaxProps : RProps {
    var imageSrc: String
}

// IMPLEMENTATIONS

data class ParallaxData(
        override var imageSrc: String
) : ParallaxProps
