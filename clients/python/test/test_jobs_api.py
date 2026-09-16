import unittest

from fever_client.api.jobs_api import JobsApi

class TestJobsApi(unittest.IsolatedAsyncioTestCase):

    async def asyncSetUp(self) -> None:
        self.api = JobsApi()

    async def asyncTearDown(self) -> None:
        await self.api.api_client.close()

    async def test_cancel_job(self) -> None:
        pass

    async def test_get_job(self) -> None:
        pass

if __name__ == '__main__':
    unittest.main()
