package pact.common

import kotlin.js.Promise

external fun isPortAvailable(port: Number, host: String): Promise<Unit>
