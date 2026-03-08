import { useState } from "react";
import { predictCollege } from "../services/api";
import { FaUniversity } from "react-icons/fa";
import ResultCard from "./ResultCard";

export default function Predictor(){

const [Rank,setRank] = useState("")
const [Gender,setGender] = useState("")
const [ExamName, setExamName] = useState("")
const [Category,setCategory] = useState("")
const [Result,setResult] = useState("")

const handleSubmit = async(e)=>{
e.preventDefault()

try{
const res = await predictCollege(Rank,Gender,Category,ExamName)
setResult(res.data)
}catch{
alert("No college found")
}

}

return(

<div className="glass p-8 w-[480px] text-white shadow-2xl">
<div className="flex items-center gap-5 justify-center mb-6">
<FaUniversity size={30}/>
<h1 className="text-3xl font-bold">College Predictor</h1>

</div>
<form onSubmit={handleSubmit} className="space-y-4">
<input
type="number"
placeholder="Enter your rank"
value={Rank}
onChange={(e)=>setRank(e.target.value)}
className="w-full p-3 rounded-lg text-black"
/>

<select
value={Gender}
onChange={(e)=>setGender(e.target.value)}
className="w-full p-3 rounded-lg text-black"
>

<option value="">Select Gender</option>
<option>Male</option>
<option>Female</option>

</select>

<select
value={Category}
onChange={(e)=>setCategory(e.target.value)}
className="w-full p-3 rounded-lg text-black"
>

<option value="">Select Category</option>
<option>OC</option>
<option>SC</option>
<option>ST</option>
<option>BCA</option>
<option>BCB</option>
<option>BCD</option>
<option>BCE</option>
<option>EWS</option>

</select>

<select
value={ExamName}
onChange={(e)=>setExamName(e.target.value)}
className="w-full p-3 rounded-lg text-black"
>

<option value="">Select Exam</option>
<option>TS - EAPCET</option>
<option>AP - EAPCET</option>


</select>

<button
className="w-full bg-indigo-700 hover:bg-green-700 p-3 rounded-lg font-semibold"
>

Predict College

</button>

</form>

{Result && <ResultCard data={Result}/>}

</div>

)

}