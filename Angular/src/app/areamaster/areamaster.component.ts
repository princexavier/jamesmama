import { AreaModel } from './../../model/AreaModel';
import { AreamasterService } from './../areamaster.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-areamaster',
  templateUrl: './areamaster.component.html',
  styleUrls: ['./areamaster.component.css']
})
export class AreamasterComponent implements OnInit {

  model: any = new AreaModel();
  constructor(private areaMasterService: AreamasterService) { }

  ngOnInit(): void {
  }
  save() {
    this.areaMasterService.save(this.model).subscribe(data=>{

    });
  }

}
