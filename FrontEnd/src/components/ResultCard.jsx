import { FaUniversity } from "react-icons/fa";

export default function ResultCard({data}){

return(

<div className="bg-white text-black mt-6 p-5 rounded-xl shadow-lg">

<h2 className="text-lg font-bold text-indigo-600 mb-3">
Eligible College
</h2>

<div className="flex gap-4 items-center">

<FaUniversity size={28} className="text-indigo-600"/>

<div>

<p>
<strong>College:</strong> {data.collegeName}
</p>

<p>
<strong>Cutoff Rank:</strong> {data.cutoff}
</p>

</div>

</div>

</div>

)

}