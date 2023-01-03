import { Component, OnInit } from '@angular/core';
import { Empleado } from 'src/app/empleado';

@Component({
  selector: 'app-lista-empleados',
  templateUrl: './lista-empleados.component.html',
  styleUrls: ['./lista-empleados.component.css']
})
export class ListaEmpleadosComponent  implements OnInit{
empleados: Empleado[];
constructor(){

}
ngOnInit(): void {
    this.empleados=[{
      "id":1,
      "nombre":"patricia",
      "apellido":"Ruiz",
      "email":"patri@hotmail.com"
    },
  {
    "id":2,
      "nombre":"romina",
      "apellido":"ramirez",
      "email":"romi@hotmail.com"
    },
  
  
  ];
}
}
