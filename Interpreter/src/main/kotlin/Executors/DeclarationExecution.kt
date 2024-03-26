package Interpreter.Executors

import ASTN.VarDeclaration
import Interpreter.Value
import Interpreter.VariableType
import token.DataType
import java.util.Optional

class DeclarationExecution: Executor<VarDeclaration> {

    override fun execute(ast: VarDeclaration, variables: MutableMap<String, Value>): String {
        val varName = ast.assignation.getValue()
        val type = getValueType(ast.type.getType())
        if (!variables.containsKey(varName)){
            variables[varName] = Value(type, Optional.empty())
            return ""
        }else{
            throw Exception("mal")
        }
    }

    private fun getValueType(dataType: DataType): VariableType{
        return when(dataType){
            DataType.NUMBER_KEYWORD -> VariableType.NUMBER
            DataType.STRING_KEYWORD -> VariableType.STRING
            else -> throw Exception("mal")
        }
    }
}