package Enforcers

import ASTN.AST
import ASTN.Method

class LineJumpOnMethodEnforcer(private val ammountOfSpacers: Int) : Enforcer {
    override fun enforceRule(code: String): String {
        val modifiedCode = StringBuilder()
        modifiedCode.append("\n".repeat(ammountOfSpacers))
        modifiedCode.append(code)
        return modifiedCode.toString()
    }
}