/**
* 
* Copyright (C) 2006-2009 Anton Gravestam.
*
* This file is part of OPS (Open Publish Subscribe).
*
* OPS (Open Publish Subscribe) is free software: you can redistribute it and/or modify
* it under the terms of the GNU Lesser General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.

* OPS (Open Publish Subscribe) is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU Lesser General Public License for more details.
*
* You should have received a copy of the GNU Lesser General Public License
* along with OPS (Open Publish Subscribe).  If not, see <http://www.gnu.org/licenses/>.
*/

#ifndef ops_BoostIOServiceImpl_h
#define ops_BoostIOServiceImpl_h

#include <boost/asio.hpp>

namespace ops
{
	class BoostIOServiceImpl : public IOService
	{
	public:
		boost::asio::io_service* boostIOService;
		BoostIOServiceImpl()
		{
			boostIOService = new boost::asio::io_service();	
		}
	
		void run()
		{
			boostIOService->run();
		}

		void stop()
		{
			boostIOService->stop();
		}

		virtual ~BoostIOServiceImpl()
		{
			boostIOService->stop();
			delete boostIOService;
		}


	};
}
#endif
