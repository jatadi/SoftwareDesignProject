package edu.trincoll.hr

// The HR class should have:
//   - a list of employees
//   - a hire method that takes an employee and returns a new HR object with that employee added
//   - a fire method that takes an id and returns a new HR object with the employee with that id removed
//   - a payEmployees method that returns the total pay of all employees
class HR(private val employees: List<Employee> = emptyList()) {
    fun hire(newEmployee: Employee): HR {
        val updatedEmployees = employees + newEmployee
        return HR(updatedEmployees)
    }

    fun fire(employeeId: Int): HR {
        val updatedEmployees = employees.filter { it.id != employeeId }
        return HR(updatedEmployees)
    }

    fun payEmployees(): Double {
        return employees.sumOf { it.pay() }
    }

//    override fun toString(): String {
//        return employees.joinToString(separator = "\n") { it.toString() }
//    }

}